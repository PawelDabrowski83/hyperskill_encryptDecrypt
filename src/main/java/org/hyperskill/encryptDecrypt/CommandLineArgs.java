package org.hyperskill.encryptDecrypt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommandLineArgs {

    protected static final Pattern MODE_PATTERN = Pattern.compile("-mode (enc|dec)");
    protected static final Pattern KEY_PATTERN = Pattern.compile("-key (-?\\d+)");
    protected static final Pattern DATA_PATTERN = Pattern.compile("-data \"(.+)\"");

    private final String mode;
    private final int key;
    private final String data;

    protected static class Builder {
        private String mode = "enc";
        private int key = 0;
        private String data = "";

        public Builder() {
        }

        public Builder mode(String val) {
            if (val.isEmpty()) {
                mode = "enc";
            } else {
                mode = val;
            }
            return this;
        }
        public Builder key(int val) {
            key = val;
            return this;
        }
        public Builder data(String val) {
            data = val;
            return this;
        }
        public CommandLineArgs build() {
            return new CommandLineArgs(this);
        }
    }
    private CommandLineArgs(Builder builder) {
        this.mode = builder.mode;
        this.key = builder.key;
        this.data = builder.data;
    }

    public String getMode() {
        return mode;
    }

    public int getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommandLineArgs)) return false;

        CommandLineArgs that = (CommandLineArgs) o;

        if (getKey() != that.getKey()) return false;
        if (getMode() != null ? !getMode().equals(that.getMode()) : that.getMode() != null) return false;
        return getData() != null ? getData().equals(that.getData()) : that.getData() == null;
    }

    @Override
    public int hashCode() {
        int result = getMode() != null ? getMode().hashCode() : 0;
        result = 31 * result + getKey();
        result = 31 * result + (getData() != null ? getData().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CommandLineArgs{" +
                "mode='" + mode + '\'' +
                ", key=" + key +
                ", data='" + data + '\'' +
                '}';
    }

    public static CommandLineArgs readCommand(String str) {
        String mode = "";
        int key = 0;
        String data = "";

        if (str != null && !str.isEmpty()) {
            Matcher matcher = MODE_PATTERN.matcher(str);
            if (matcher.find()) {
                mode = matcher.group(1);
            }
            matcher = KEY_PATTERN.matcher(str);
            if (matcher.find()) {
                try {
                    key = Integer.parseInt(matcher.group(1));
                } catch (NumberFormatException e) {
                    System.out.println("Cannot parse " + matcher.group(1));
                }
            }
            matcher = DATA_PATTERN.matcher(str);
            if (matcher.find()) {
                data = matcher.group(1);
            }
        }
        return new CommandLineArgs.Builder().mode(mode).key(key).data(data).build();

    }
}

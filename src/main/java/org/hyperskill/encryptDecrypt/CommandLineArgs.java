package org.hyperskill.encryptDecrypt;

import java.util.regex.Pattern;

public class CommandLineArgs {

    protected final Pattern MODE_PATTERN = Pattern.compile("-mode (enc|dec)");
    protected final Pattern KEY_PATTERN = Pattern.compile("-key (\\d+)");
    protected final Pattern DATA_PATTERN = Pattern.compile("-data \"(.+)\"");

    private final String mode;
    private final int key;
    private final String data;

    public static class Builder {
        private String mode = "enc";
        private int key = 0;
        private String data = "";

        public Builder() {
        }

        public Builder mode(String val) {
            mode = val;
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
}

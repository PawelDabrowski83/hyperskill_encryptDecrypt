# hyperskill_encryptDecrypt

<p>Project written with guidelines from Hyperskill, but with TDD approach and proper Git history.</p>

<h2>Stage 1</h2>
<p>Learn to input the data and encrypt it, replacing the letters. </p>
<p>For the first stage, you need to manually encrypt the message "we found a treasure!" and print only the ciphertext (in lower case).
   
   To encrypt the message, replace each letter with the letter that is in the corresponding position from the end of the English alphabet (a→z, b→y, c→x, ... x→c, y →b, z→a). Do not replace spaces or the exclamation mark.
   
   Use the given template to your program to print the ciphertext instead of the original message.
   
   The output should look like ## ##### # ########! where # is a lower-case English letter.</p>

<h2>Stage 2</h2>
<p>Learn to encrypt messages with a numeric key, using the Caesar cypher.  </p>
<p>Write a program that reads an English message and an integer number (key) from the standard input and shifts each letter by the specified number according to its order in the alphabet. If you reach the end of the alphabet, start back at the beginning (a follows z).
   
   The English alphabet is below:
   
   abcdefghijklmnopqrstuvwxyz
   The program should not modify non-letter characters.
   
</p>

<h2>Stage 3</h2>
<p>Encrypting a message is only half of the deal: now learn to decrypt it as well, using a standard Unicode table. </p>
<p>Write a program that reads three lines from the standard input: a target operation (enc - encryption, dec - decryption), a message or a cyphertext, and a key to encrypt/decrypt messages. All non-letter characters must be encrypted as well as regular letters. We recommend you to get an integer representation of each character (according to the Unicode table) to shift it.</p>

<h2>Stage 4</h2>
<p>Practice working with the command line, using it for passing the mode, the key and the string. </p>
<p>Modify the previous program to work with command-line arguments instead of the standard input. The program must parse three arguments: -mode, -key and -data. The first argument should determine the program’s mode (enc - encryption, dec - decryption). The second argument is an integer key to modify the message, and the third argument is a text or ciphertext within quotes to encrypt or decrypt.
   
   All the arguments are guaranteed to be passed to the program. If for some reason it turns out to be wrong:
   
       If there is no -mode, the program should work in enc mode.
       If there is no -key, the program should consider that key = 0.
       If there is no -data, the program should assume that the data is an empty string.
</p>

<h2>Stage 5</h2>
<p>Work with files: learn to store your data in a file.  </p>

<h2>Stage 6</h2>
<p>Add the possibility to choose a specific encryption algorithm: Ceasar or Unicode. </p>

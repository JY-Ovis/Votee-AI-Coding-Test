# Wordle Puzzle Project

## (Summary) -- Ignore this part if u r buzy

Hello, my name is Jacky, Yr3 CS student, this project is to code a Wordle puzzle.
Since the guidelines are limited, I made some assumptions and established my own rules for the functions.
I have tried my best to follow and declare all the given variable names.
There are a total of three functions.

## Reminder -- explaining the "slot" usage

The slot represents the index of the word in function one, but in functions two and three, it represents the entire word’s index in the ArrayList.

## Function One (Guess Daily) -- funtion 1 mechanism + logic

This function focusing on individual letters rather than the entire word.
This is the easiest and most commonly appear in the real-world wordle puzzle, it starts guessing from the first letter of the word.
If your guessed letter matches the letter in the answer, the result will be marked as "correct."
If the letter doesn't match but appears elsewhere in the word, the result will be marked as "present."
If the letter does not appear in the word at all, the result will be marked as "absent."

## Function Two (Guess Random) -- funtion 2 mechanism + logic

Starting from this function, it will start guessing the entire word instead of focusing on individual letters.
If the guessed word matches the answer word, the result will be marked as "correct," and the function will stop.
If the guessed word does not match the answer word, the result will be marked as "absent," and the function will select another random word as the answer for the next guessing attempt.
It turns out to be the hardest to guess in real life. This process will continue until the correct answer is reached.

## Function three (Guess Selected) -- funtion 3 mechanism + logic

This function are mostly the same as function two, also guessing the entire word instead of focusing on individual letters.
If the guessed word matches the answer word, the result will be marked as "correct", and the function will stop.  
If the guessed word does not match the answer word, the result will be marked as "absent" and try again until the answer word is guessed.
The key difference is that the answer word remains fixed and unchanged for all the guessing attempts.

## Problems -- Unable to solve due to time limitation

I have no idea how to connect to the API in JAVA and some variables name I have never used in the code (maybe useful using with the API).
I used to have exp in a server cloud proj using JavaScript, MongoDB, and completed a proj using a RESTful API.
I will keep on studying and learn for the new and never tried tech knowledge in the future.
No matter what the result is, ty for inviting me to complete the test.

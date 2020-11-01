# YetiTracker
This program is meant to simulate a program that receives data from a location tracking device
Dogwalker method simulates walking the dog and adds coordinates to a list (in an actual project I'd pull the data from an sql database, here I simulate it by having it make random movements)
DogWriter method writes down all the coordinate, one coordinate per line to a file in your desktop 
FilereaderINT reads what DogWriter wrote
InputReaderINT is supposed to act as a remote to randomly switch between these in the main loop in the main method.

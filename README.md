# Project1_Zoo
Zoo implementation in Java for Project 1 of OOAD Fall 2020

##Group Member Names:
Gregorio Figueroa, Darrien Lee

##Assumptions: 
As far as assumptions go there are not any in 
particular. We didn't set a specific check for animal name 
starting with correct letter. I just created all the objects 
with the correct name schema. We had the same animals that 
were found in the slides in which we were told. The other 
animals were shark and clownfish which are both fish. 

For the main implementation of the zookeeper, we had the 
zookeeper functions handle all the animal actions by passing 
in a collection of animals to each zookeeper method. This 
allowed us to keep the main fairly scarce. for each animla method, 
if for some reason the animal was unable to complete a task, 
the zoookeeper was not able to move to a different task until 
the animal did a specific thing. This allows us to know that 
each animla eventually was able to complete all there tasks. 
This is why we didn't have any specific checks for animals
being in a current state. We did though include some capabilites
for that check, i.e asleep boolean for each animal. Something added was
a simple variable time that was used only for console outputs.


##Issues: 
We didnt encounter any issues during development. The only 
hiccups were syntax errors and rustiness with git. Once
we were able to talk, we were able to fix these syntax
issues. 


##Special Instructions: 
For running the program, there will be a 
time for you to enter in a number. Besides that don't be alarmed 
with there not being much console output. It will all be outputed to a file entitled
dayatthezoo.output. 
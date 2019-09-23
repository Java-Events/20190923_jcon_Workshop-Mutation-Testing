

# 20190320_Workshop_Mutation-Testing
Mutation Testing - Start hunting the bugs

## this workshop
We will have a lot of practical exercises so that 
you will have good base for your daily work after this workshop.

Junit5 will be part of this workshop, 
to make sure that you have all needed information's that we are using, 
we will start with core jUnit5 and Java8.

 You will learn:
* The theoretical part what mutation testing is and how it works
* The difference compared to other testing strategies
* How to start in a new project with mutation testing
* How to optimize mutation testing strategies for larger projects
* How to start in legacy projects with mutation testing
* How you can use the reports for
    * Developers
    * Project Leads and Managers

We will start using it with core Java 
and step by step we are extending it up 
to full stack tests of a web app.

All of this will be in Core Java. 
If you are coding in kotlin as well, 
you will be able to try this too.

## Basic theory

JUnit is a well-known tool for Java developers in the area of TDD. 
Here it has become accepted, that CodeCoverage can be measured. 
In this case, we distinguish between coverage on the level of classes, 
methods and rows. The goal is to get the CodeCoverage as high as possible 
on the line level, but not higher than necessary.
What exactly does it mean? A CodeCoverage of appr. 
75% on the line level is excellent and can already provide a basis. 
However, what does this figure say?

In this workshop, we are dealing with the term Mutation Testing 
and show the practical ways of use. How can the coverage be defined 
and what can be achieved?
How can it be integrated into an existing project 
and what should be considered while running a test?

## for the impatiens
It’s the term Mutation Testing to be applied here. 
This term itself was mentioned for the first time in 
the literature in the 70s.  

The principle is straightforward: 
you create mutations out of one piece of source code. 
If you run them through the existing tests, at least one test should fail. 
Here it is common to say that the mutation did not survive. 
In another case, the mutation survived if all the tests end successfully. 
According to the tests, it is irrelevant what version remains, 
and it is not their goal.  

Besides, the system contains some vagueness which over 
the long-term in combination with other uncertainties can 
lead to indeterminable errors. Therefore the goal should be to 
create not only a high CodeCoverage but make it as robust as possible.
What kind of support accurately can a machine provide in this case?


## Timeline (in engl.)
* Introduction 
* **(p001)** Basics Intro to jUnit5 
* **(p002)** practical Junit5 Testing, Core Java 
* **(p003)** concurrent Junit5 Testing, Core Java 
* **(p004)** dynamic/non-static Junit5 Testing, Core Java 
        * TestTemplate
        * Dynamic Tests
        * ParameterizedTests

* **(p010)** theoretical Mutation Testing 
* **(p011)** practical MutationTesting – Core Java 



## public additional informations
A few links to additional resources that will help to 
work on the topic later again.

[Mutation Testing engl - JFokus](https://youtu.be/9yG1c9Crnbk) 
[Mutation testing Framework](http://pitest.org/) 

## Slides
The slides are available as pdf in the data folder.
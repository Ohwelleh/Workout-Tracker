# Workout Tracker
Workout tracker is a desktop application developed in Java and JavaFX. The goal of this tracker was to allow for workouts to be entered on the Workout screen and then update the relevant information on the Big 3 and Personal Best. The Big 3 screen graphs the progress of the flat bench, squats, and deadlift exercises. Finally, the Personal Best screen logs all the personal bests weights for both the "Strength" and "Reps" workout types.

I define the "Strength" workout type as any exercise perfomed in the rep range of 3-5, while "Reps" are in the rep range of 8-12/to failure.

### Current version
- All the windows have the basic functionality implemented.
- Currently displaying mock data properly

### Current issues
- Changing between scene cause everyting thing to be re-initialized (Currently only an issue with the "Workout" page)
- When clicking the "Add Workout" button an Exception is thrown.
- The Graphs on the Big Three page display weights starting at 0 to the max, instead of the minimum weight entered to maximum.

## Workout page
This page allows users to enter their workouts to track the date, time, weights, and exercises done. The goal is to have this data then be used to update the Big 3 and Personal best pages.
![Workout](https://github.com/Ohwelleh/Workout-Tracker/blob/master/ReadMeImage/Workout.png)

## Big Three Graph
This page is to visually display the progress of users Flat Bench, Squat, and Deadlift.
![Big Three](https://github.com/Ohwelleh/Workout-Tracker/blob/master/ReadMeImage/Big%20three.png)


## Personal Best
This page allows users to easily see their maximum weights used for both Strenth training and High Rep training.
![Personal Best](https://github.com/Ohwelleh/Workout-Tracker/blob/master/ReadMeImage/Personal%20Best.png)

A car factory has two assembly lines, each with n stations. The time taken per station is denoted by ai[j] I is line 1 or 2 and j is station. Each station is dedicated to some sort of work like engine fitting, body fitting, painting and so on. So, a car chassis must pass through each of the n stations in order before exiting the factory. The parallel stations of the two assembly lines perform the same task. After it passes through station Si,j, it will continue to station Si,j+1 unless it decides to transfer to the other line. Continuing on the same line incurs no extra cost, but transferring from line i at station j – 1 to station j on the other line takes time ti[j]. Assembly line 1 takes an entry time e1 and exit time x1. ]. Assembly line 2 takes an entry time e2 and exit time x2. Task was to compute the minimum time it will take to build a car chassis.
Following are points to consider
•	Two assembly lines, 1 and 2, each with stations from 1 to n.
•	A car chassis must pass through all stations from 1 to n in order(in any of the two assembly lines). i.e. it cannot jump from station i to station j if they are not at one move distance.
•	The car chassis can move one station forward in the same line, or one station diagonally in the other line. It incurs an extra cost ti, j to move to station j from line i. No cost is incurred for movement in same line.
•	The time taken in station j on line i is ai, j.
T1(j) is the time taken by the car chassis to leave station j on assembly line 1.
T2(j) is the time taken by the car chassis to leave station j on assembly line 2.

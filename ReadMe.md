#### Job Execution VS JobInstance

. Every time job get executed it's a new Instance, At a given instance we can only run the job once, if it fails it run again with the same job instance

. Whenever Job Starts that a new instance, and either it fails or Complete successfully, and it stored the job instance information in DB.

. Job Instance should be unique for each time job runs.


### JOb Execution context:

We can store the job information to across the various steps levels, pass some info in vaious steps

### Step Execution Context:

Each step has step execution, and once the step is executed we store the info in db.

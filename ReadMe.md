#### Job Execution VS JobInstance

. Every time job get executed it's a new Instance, At a given instance we can only run the job once, if it fails it run again with the same job instance

. Whenever Job Starts that it should be a unique new instance, and either it fails or Complete successfully, and it stored the job instance information in DB.

. Job Instance should be unique for each time job runs.


### JOb Execution context:

We can store the job information to across the various steps levels, pass some info in various steps, once job completed then only we save the job execution params into DB

### Step Execution Context:

Each step has step execution, and once the step is executed we store the info in db.

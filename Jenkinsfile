pipeline 
{
    agent any

    stages
 {
        stage('Build')
 {
            steps
 {
                echo 'Build Application'
            }
        }

   stage('Test')
 {
            steps
 {
                echo 'Test the Application'
            }
        }
   stage('Deploye')
 {
            steps
 {
                echo 'Deploye Application'
            }
        }


    }
post{

always{

       emailext body: 'summary', subject: 'Simplepipeline', to: 'sivasrinadh02@gmail.com'
}


}
 


}

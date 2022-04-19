pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/sumeetyajnik/SumeetYajnik_FSD_Course6_Spring_Boot_Api.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}
def buildApp() {
    echo "Buidling Application"
}


def testApp() {
    echo "Testing Application"
}

def deployApp() {
    echo 'deploying Application'
    echo "Deploying version ${params.Version}"
}

return this
def call(){

sh 'curl -X POST -v --user SumaVarshitha:sumasuji268 -H "ContentType: application/json; charset=UTF-8" "https://api.github.com/repos/SumaVarshitha/demo" -d {"name":"demo"}'

}

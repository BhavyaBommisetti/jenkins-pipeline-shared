def call()
{
 /*'''
curl -X POST \
  'https://gitlab.com/api/v4/projects?private_token=VkjgB4Jdbaswh7FNXeC-&%2F15483041%2Frepository%2Fbranches%3Fbranch=newbranch&ref=master' \
  -H 'accept: application/json' \
  -H 'authorization: Basic c3VtYXZhcnNoaXRoYS5rYW1hdGFtOTk3QGdtYWlsLmNvbTpyYXZ6SkpjSjZpaC15cnBjaGlMcw==' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 58e43733-54d5-f61f-12fd-92b40455a1bd' \
  -d '{
  "name": "dev",
  "merged": false,
  "protected": false,
  "default": false,
  "developers_can_push": false,
  "developers_can_merge": false,
  "can_push": true

}'
'''*/
  
 sh '''
 curl -X POST \
  'https://gitlab.com/api/v4/projects/15483041/repository/branches?private_token=VkjgB4Jdbaswh7FNXeC-&branch=fef&ref=master' \
  -H 'accept: application/json' \
  -H 'authorization: Basic c3VtYXZhcnNoaXRoYS5rYW1hdGFtOTk3QGdtYWlsLmNvbTpWa2pnQjRKZGJhc3doN0ZOWGVDLQ==' \
  -H 'cache-control: no-cache' \
  -H 'content-type: application/json' \
  -H 'postman-token: 7b560c12-dcfe-5768-bacb-705b94d4e677'
  '''

}

var frisby = require('/Users/parawat/node_modules/frisby');
 

 
 frisby.create('GET REQUEST initiated').get('http://jsonplaceholder.typicode.com/posts/1').expectStatus(200)
 .expectHeaderContains('content-type', 'application/json')
 .inspectJSON()
 .expectJSON({
    userId: 1,
   id: 1,
    title: "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
        body: 'quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto',
  }).toss();

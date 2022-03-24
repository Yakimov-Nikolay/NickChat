const url = 'http://localhost:8080';
let stompClient;
let selectedUser;

function connectToChat(username) {
    console.log("connecting to chat...");
    let socket = new SockJS(url + '/chat');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log("connected to " + frame);
        stompClient.subscribe("/topic/messages/" + username, function (response){
            let data = JSON.parse(response.body);
            console.log(data);
        });
    });
}
function sendMessage(from, text){
    stompClient.send("/app/chat/" + selectedUser, {}, JSON.stringify({
        fromLogin: from,
        message: text
    }));
}
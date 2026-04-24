const BASE_URL = "http://localhost:8080/users";

// ADD USER
function addUser() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;

    fetch(BASE_URL + "/addUser", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({ name, email })
    })
    .then(res => res.text())
    .then(data => alert(data));
}

// GET USERS
function getUsers() {
    fetch(BASE_URL + "/getUsers")
    .then(res => res.json())
    .then(data => {
        const list = document.getElementById("userList");
        list.innerHTML = "";

        data.forEach(user => {
            const li = document.createElement("li");
            li.textContent = `${user.id} - ${user.name} - ${user.email}`;
            list.appendChild(li);
        });
    });
}
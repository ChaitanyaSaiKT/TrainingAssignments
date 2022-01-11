
function validate() {
  let user = document.querySelector('.un');
  let pass = document.querySelector('.pass');
  let mis = document.querySelector('#msg');
  let passpatern = /@[A-Za-z]{0,9}$/;
  if (user.value === "" || user.value.length < 3 || user.value.length > 8 || pass.value === "" || pass.value.length < 4 || pass.value.length > 9 || pass.value === (passpatern.value)) {
    mis.innerHTML = 'User name should have minimum of 3 letters and maximum of 8 letters Password should have minimum of 4 letters and maximum of 9 letters, numbers and special characters';
    return false;
  }
  return true;
}

function registrationvalidate() {
  let first = document.getElementById('fname').value;
  let last = document.getElementById('lname').value;
  let username = document.getElementById('uname').value;
  let password = document.getElementById('passvalue').value;

  if (first === "" || first.length < 5 || first.length > 10 || last === "" || last.length < 5 || last.length > 10 || username === "" || username.length < 4 || username.length > 8 || password === "" || password.length < 5 || password.length > 10) {
    alert('first name should have minimum of 5 letters and maximum of 10 letters,Last name should have minimum of 5 letters and maximum of 10 letters,User name should have minimum of 4 letters and maximum of 8 letters,Password should have minimum of 5 letters and maximum of 10 letters')
    return false;
  }
  return true;
}
function saveData() {
  let id, name, salary, department, skill;
  id = document.getElementById("eid").value;
  name = document.getElementById("ename").value;
  salary = document.getElementById("esalary").value;
  department = document.getElementById("Departments").value;
  skill = document.getElementById("Skills").value;

  let emp_data = new Array();
  emp_data = JSON.parse(localStorage.getItem("emp")) ? JSON.parse(localStorage.getItem("emp")) : []
  emp_data.push({
    "eid": id,
    "ename": name,
    "esalary": salary,
    "Departments": department,
    "Skills": skill,
  })
  localStorage.setItem("emp", JSON.stringify(emp_data));

}


function showData() {
  document.getElementById("showUsers").innerHTML = "";
  let emp_data = new Array();
  emp_data = JSON.parse(localStorage.getItem("emp")) ? JSON.parse(localStorage.getItem("emp")) : []
  if (emp_data) {
    for (let i = 0; i < emp_data.length; i++) {
      let addDiv = document.createElement('div');
      addDiv.className = "row";
      addDiv.innerHTML = '<div class="col-sm-2" style="padding: 10px;">' + emp_data[i].eid + '</div><div class="col-sm-4" style="padding: 10px;">' + emp_data[i].ename + '</div><div class="col-sm-2" style="padding: 10px;">' + emp_data[i].esalary + '</div><div class="col-sm-2" style="padding: 10px;">' + emp_data[i].Departments + '</div><div class="col-sm-2" style="padding: 10px;">' + emp_data[i].Skills + '</div>';
      document.getElementById("showUsers").appendChild(addDiv);

    }
  }
}
function deletebyid() {
  let stored = JSON.parse(localStorage.getItem("emp"));
  let deletevalue = document.getElementById('del').value;
  for (let i = 0; i < stored.length; i++) {
    if (stored[i].eid === deletevalue) {
      stored.splice(i, 1);
      localStorage.setItem("emp", JSON.stringify(stored));
      alert('Removed');
    }
  }
}

function getdetailsbyid() {
  let storeddata = JSON.parse(localStorage.getItem("emp"));
  let Value = (document.getElementById('searchid')).value;
  let res = storeddata.filter((obj) => obj.eid === Value);
  document.getElementById('searched').innerHTML = JSON.stringify(res);

}

function dateTime() {
  const timeDisplay = document.getElementById("txt");
  const dateString = new Date().toLocaleString();
  timeDisplay.textContent = dateString.replace();
}
setInterval(dateTime, 1000);



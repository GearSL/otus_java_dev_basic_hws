function addRow() {
    let table = document.querySelector("#studentsTable tbody");
    let newRow = table.insertRow(table.rows.length - 2);
    let studentNameCell = newRow.insertCell(0);
    let studentGenderCell = newRow.insertCell(1);
    let studentDateOBirthCell = newRow.insertCell(2);
    let studentAgeCell = newRow.insertCell(3);

    let studentNameInp = document.querySelector("#studentName").value;
    let genderInp = document.querySelector("#gender").value;
    let dateBirthInp = document.querySelector("#dateBirth").value;
    let ageInp = document.querySelector("#age").value;

    let studentName = document.createTextNode(studentNameInp);
    let studentGender = document.createTextNode(genderInp);
    let studentDateOBirth = document.createTextNode(dateBirthInp);
    let studentAge = document.createTextNode(ageInp);

    studentNameCell.appendChild(studentName);
    studentGenderCell.appendChild(studentGender);
    studentDateOBirthCell.appendChild(studentDateOBirth);
    studentAgeCell.appendChild(studentAge);

    updateTableData();
}

function updateTableData(){
    setAverageAge(calculateAverageAge());
}

function calculateAverageAge() {
    let table = document.getElementById("studentsTable");
    let summableCellIndex = 3;
    let summableCellsCount = 0;
    let sumAge = 0;
    let averageAge;

    for (let i = 1; i < table.rows.length - 2; i++) {
        summableCellsCount += 1;
        sumAge += parseInt(table.rows[i].cells[summableCellIndex].innerText);
        averageAge = sumAge / summableCellsCount;
    }
    return averageAge;
}

function setAverageAge(age) {
    let table = document.getElementById("studentsTable");
    let rowIndex = table.rows.length - 1;
    let cellIndex = 1;

    table.rows[rowIndex].cells[cellIndex].innerText = age
}

function addRow() {
    let table = document.querySelector("#studentsTable tbody");
    console.log(table);
    document.createElement("tr");
    //table.append("<tr><td>AddRow</td><td>female</td><td>03/03/2015</td><td>15</td></tr>");
    // table.append(document.createElement("tr"));
    // table.append(document.createElement("td"));
    //= "<tr><td>AddRow</td><td>female</td><td>03/03/2015</td><td>15</td></tr>" + table.innerHTML;
    //table.innerHTML += "<tr><td>BOTTOM</td><td>BB</td></tr>";

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

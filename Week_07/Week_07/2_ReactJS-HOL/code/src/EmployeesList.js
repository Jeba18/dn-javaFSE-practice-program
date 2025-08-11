import React from "react";
import EmployeeCard from "./EmployeeCard";

function EmployeesList() {
  const employees = [
    { id: 1, name: "John Doe", role: "Developer" },
    { id: 2, name: "Jane Smith", role: "Designer" },
  ];

  return (
    <div style={{ display: "flex", justifyContent: "center", marginTop: "20px" }}>
      {employees.map((emp) => (
        <EmployeeCard key={emp.id} employee={emp} />
      ))}
    </div>
  );
}

export default EmployeesList;

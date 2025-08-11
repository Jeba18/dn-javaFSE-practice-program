import React, { useContext } from "react";
import ThemeContext from "./ThemeContext";

function EmployeeCard({ employee }) {
  const theme = useContext(ThemeContext);

  const styles = {
    background: theme === "light" ? "#f0f0f0" : "#333",
    color: theme === "light" ? "black" : "white",
    margin: "10px",
    padding: "20px",
    borderRadius: "8px",
    width: "200px",
  };

  return (
    <div style={styles}>
      <h3>{employee.name}</h3>
      <p>{employee.role}</p>
      <button style={{ padding: "5px 10px" }}>View Profile</button>
    </div>
  );
}

export default EmployeeCard;

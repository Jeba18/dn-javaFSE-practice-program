import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view, setView] = useState("book");

  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>
      <h1>Welcome to Blogger App</h1>
      <button onClick={() => setView("book")}>Book</button>
      <button onClick={() => setView("blog")}>Blog</button>
      <button onClick={() => setView("course")}>Course</button>

      {view === "book" && <BookDetails />}
      {view === "blog" && <BlogDetails />}
      {view === "course" && <CourseDetails />}
    </div>
  );
}

export default App;

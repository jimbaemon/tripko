import React from "react";
import logo from "./logo.svg";
import "./App.css";
import "./MockSerivce/board";
import { getBoards } from "./MockSerivce/board";
import { getUsers } from "./MockSerivce/user";
import { getComments } from "./MockSerivce/comment";
function App() {
  const boards = getBoards();
  const users = getUsers();
  const comments = getComments();  
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.tsx</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;

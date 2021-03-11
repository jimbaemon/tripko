import React, { useEffect } from 'react';
import 'App.css';
import { getUsers } from 'MockSerivce/user';

function App() {
  useEffect(() => {
    getUsers();
  }, []);

  return (
    <div className="App">
      <header className="App-header">
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

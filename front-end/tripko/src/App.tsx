import React from 'react';
import 'App.css';
import LoginForm from 'components/auth/login/LoginForm';
import { Route, Switch } from 'react-router-dom';
import RegisterForm from 'components/auth/register/RegisterForm';

function App() {
  return (
    <Switch>
      <Route path="/" component={LoginForm} exact />
      <Route path="/register" component={RegisterForm} />
    </Switch>
  );
}

export default App;

import React from 'react';
import 'components/auth/login/LoginForm.scss';
import { Link } from 'react-router-dom';

function LoginForm() {
  return (
    <div className="container">
      <Link to="register">회원가입</Link>
    </div>
  );
}

export default LoginForm;

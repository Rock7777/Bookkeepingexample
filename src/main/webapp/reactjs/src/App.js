import React from 'react';
import './App.css';
import NavigationBar from './components/NavigationBar'
import { Container,Row, Jumbotron } from 'react-bootstrap'

function App() {
  return (
    <div className="App">
      <NavigationBar/>
      <Container>
      <Row>
        <Jumbotron>
          <h1>Hello, world!</h1>
          <p>
            This is a simple hero unit, a simple jumbotron-style component for calling
            extra attention to featured content or information.
          </p>
          <p>
           
          </p>
        </Jumbotron>
        </Row>
        </Container>

    </div>
  );
}

export default App;

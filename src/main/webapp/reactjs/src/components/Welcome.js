import React,{Component}from 'react'
import { Jumbotron } from 'react-bootstrap'


export default class Welcome extends Component
{
  render()
  {
    return(
    <div>
    <Jumbotron className="bg-dark text-white">
              <h1>Welcome to Book Shop!!!</h1>
              <blockquote className="blockquote mb-0">
              <p>
               Good friends, good books, and a sleepy conscience : this is ideal
              </p>
              <footer className="blockquote-footer">
                Mark Twain
              </footer>
              </blockquote>
              <p>

              </p>
              <p>

              </p>
              </Jumbotron>
    </div>
    )
  }

}



    import React from 'react'
    import { Navbar,Nav } from 'react-bootstrap'

    class NavigationBar extends React.Component
    {
    render()
    {
     return(
     <div>
     <Navbar bg="dark" variant="dark">
     <Navbar.Brand href="/">
     <img src="https://upload.wikimedia.org/wikipedia/commons/b/ba/Book_icon_1.png" width="25" height="25" alt="brand"/>
     Book Shop
     </Navbar.Brand>
     <Nav className="mr-auto">
           <Nav.Link href="#">Add Book</Nav.Link>
           <Nav.Link href="#">Book List</Nav.Link>
         </Nav>
     </Navbar>
     </div>)

    }
    }



    export default NavigationBar
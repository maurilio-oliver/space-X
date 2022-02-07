import React from "react";
import { Button, Container, Form } from "react-bootstrap";
class SinginPage extends React.Component{

    constructor(props){
        super(props)
        props = {}
        this.onChangeHandler = this.onChangeHandler.bind(this)
        this.onClickHandler = this.onClickHandler.bind(this)

    }

    onChangeHandler(event){
        var eName = event.target.name;
        var eValue = event.target.value;

        this.props = {...this.props,[eName]:eValue}
    }
    onClickHandler(){
        console.log(this.props)
        console.log(<Button onClick={this.onClickHandler}>enviar</Button>)
    }
    render(){

        return (<>
        <Container fluid="md">
            <Form fluid="md">
                <Form.Group>
                    <Form.Control name="email" onChange={this.onChangeHandler}/>
                    <Form.Control name="password" onChange={this.onChangeHandler}/>
                    <Button onClick={this.onClickHandler}>enviar</Button>
                </Form.Group>

            </Form>
        </Container>
        </>)
    }
}

export default SinginPage
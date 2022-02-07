import React from "react"
import { Col, Container, Form, Row } from "react-bootstrap"
class SingOnPage extends React.Component{
    constructor(){
        super()

    }

    render(){
        return(<>
        <Container>
            <Col>
                <Row>
                    <Form>
                        <Form.Group>
                            <Form.Control/>
                        </Form.Group>
                    </Form>
                </Row>
            </Col>
        </Container>
        </>)
    }
}
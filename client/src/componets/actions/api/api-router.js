export const SERVER_ROUTERS = {
    GET_PERSON_BY_ID: (id) => `configuration/person/${id}/`,
    GET_ALL_PERSON: `configuration/person/`,
    POST_PERSON: `configuration/person/`,
    DELETE_PERSON_BY_ID: `configuration/detelet/person/id`,
    UPDATE_CADASTER_PERSON: `configuration/update/person/id`,
    

}

export const CLIENT_ROUTERS = {
    INDEX: `/index/`,
    UPDATE_PERSON_BY_ID: `/home/conf/application/:id/update`,
    HOME:`index/home/:id`
}
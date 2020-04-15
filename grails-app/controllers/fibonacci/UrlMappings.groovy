package fibonacci

class UrlMappings {

    static mappings = {
        "/fibonacci-sequence"(resources: 'fibonacci', includes: ['show'])

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}

//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji

package bhilani.interoperability.jvm

import groovy.json.*

def sdk = new JVMSDKit()

def params = [ page: "1" ]

try {
    println "Groovy SDK"
    
    def jsonInput = JsonOutput.toJson(params)
    def response = sdk.fetchInteroperability("", jsonInput)
    
    println JsonOutput.prettyPrint(response)
} catch (e) {
    println "Error: $e.message"
}

//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
//ramramjiramramjuramramji
//ramramjiramramjuramramji
//ramramjiramramjiramramji
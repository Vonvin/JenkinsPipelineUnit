package com.lesfurets.jenkins.unit.global.lib
import groovy.transform.CompileStatic

@CompileStatic
class LibraryRecord {

    LibraryConfiguration configuration
    String version
    List<String> rootPaths
    Boolean resolve

    Map<String, Object> definedGlobalVars

    LibraryRecord(LibraryConfiguration configuration, String version, List<String> rootPaths, Boolean resolve = true) {
        this.configuration = configuration
        this.version = version
        this.rootPaths = rootPaths
        this.resolve = resolve
    }

    String getIdentifier() {
        return "$configuration.name@$version"
    }
}

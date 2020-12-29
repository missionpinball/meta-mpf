DESCRIPTION = "Protocol Buffers"
HOMEPAGE = "https://developers.google.com/protocol-buffers/"
SECTION = "devel/python"

PYPI_PACKAGE = "protobuf"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=19e8f490f9526b1de84f8d949cfcfd4e"

inherit pypi setuptools3

SRC_URI[md5sum] = "b5d489c03800fcd9b5fa01b452f48d84"
SRC_URI[sha256sum] = "1d63eb389347293d8915fb47bee0951c7b5dab522a4a60118b9a18f33e21f8ce"

# http://errors.yoctoproject.org/Errors/Details/184715/
# Can't find required file: ../src/google/protobuf/descriptor.proto
CLEANBROKEN = "1"

UPSTREAM_CHECK_REGEX = "protobuf/(?P<pver>\d+(\.\d+)+)/"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-logging \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-numbers \
    ${PYTHON_PN}-pkgutil \
    ${PYTHON_PN}-six \
    ${PYTHON_PN}-unittest \
"

# For usage in other recipies when compiling protobuf files (e.g. by grpcio-tools)
BBCLASSEXTEND = "native nativesdk"

DEPENDS += "protobuf"
#DISTUTILS_BUILD_ARGS += "--cpp_implementation"
#DISTUTILS_INSTALL_ARGS += "--cpp_implementation"

do_compile_prepend_class-native () {
    export KOKORO_BUILD_NUMBER="1"
}

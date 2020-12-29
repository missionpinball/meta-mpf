DESCRIPTION = "Google gRPC tools"
HOMEPAGE = "http://www.grpc.io/"
SECTION = "devel/python"

PYPI_PACKAGE = "grpcio-tools"

DEPENDS_append = " ${PYTHON_PN}-grpcio-mpf"
RDEPENDS_${PN} += " ${PYTHON_PN}-grpcio-mpf"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=7145f7cdd263359b62d342a02f005515"

inherit pypi setuptools3

export GRPC_PYTHON_LDFLAGS = " -lpthread -Wl,-wrap,memcpy -static-libgcc"

SRC_URI[md5sum] = "f5fea06a4ee9b876a3176f475339d7d0"
SRC_URI[sha256sum] = "db5a6f0130256d534cbe35eab37d37a448d96f4fd736e5051c6be1aee49cea1d"

BBCLASSEXTEND = "native nativesdk"

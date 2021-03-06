DESCRIPTION = "Google gRPC"
HOMEPAGE = "http://www.grpc.io/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PYPI_PACKAGE = "grpcio"

DEPENDS += "${PYTHON_PN}-protobuf-mpf"

SRC_URI += "file://0001-setup.py-Do-not-mix-C-and-C-compiler-options.patch"
# SRC_URI_append_class-target = " file://ppc-boringssl-support.patch \
#                                file://riscv64_support.patch \
#                                file://0001-Fix-build-on-riscv32.patch \
#"

SRC_URI[md5sum] = "e8f1b58bd622147d13a0fab5632a5004"
SRC_URI[sha256sum] = "f98f746cacbaa681de0bcd90d7aa77b440e3e1327a9988f6a2b580d54e27d4c3"

RDEPENDS_${PN} = "${PYTHON_PN}-protobuf-mpf \
                  ${PYTHON_PN}-setuptools \
                  ${PYTHON_PN}-six \
"

inherit setuptools3
inherit pypi

export GRPC_PYTHON_DISABLE_LIBC_COMPATIBILITY = "1"
#export GRPC_PYTHON_LDFLAGS = " -lpthread -Wl,-wrap,memcpy -static-libgcc"

do_compile_prepend_toolchain-clang() {
    export GRPC_PYTHON_CFLAGS='-fvisibility=hidden -fno-wrapv -fno-exceptions'
}

CLEANBROKEN = "1"

BBCLASSEXTEND = "native nativesdk"

CCACHE_DISABLE = "1"

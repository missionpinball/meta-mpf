DESCRIPTION = "Library for Multimorphic, Inc.'s P-ROC and P3-ROC pinball controller boards"
SECTION = "libs"
HOMEPAGE = "https://github.com/preble/libpinproc"
LICENSE = "MIT"
DEPENDS = "libusb1 libftdi zlib boost"
RDEPENDS_${PN} += ""
SRCNAME = "libpinproc"
PR = "r1"

LIC_FILES_CHKSUM = "file://README.markdown;md5=b9220756fc28b4f2ea420ae50e3a01e0"

SRC_URI = "git://github.com/preble/libpinproc.git;protocol=git;tag=286c56694dae9f068e6ba14f8f625026f15e54c7;branch=dev"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DCROSS_ROOT=${PKG_CONFIG_SYSROOT_DIR}"

inherit pkgconfig cmake

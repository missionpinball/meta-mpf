SUMMARY = "Kivy Python GUI toolkit"

PYPI_PACKAGE = "Kivy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ee70f3ff06f02618c3e9ceadfe1cf0f4"

DEPENDS = "virtual/libsdl2 libsdl2-image libsdl2-mixer libsdl2-net libsdl2-ttf freetype python3-cython-native gstreamer1.0 python3-pkgconfig-native"
RDEPENDS_${PN} += "python3 python3-pygments-mpf python3-docutils python3-kivy-garden-mpf"

inherit pypi setuptools3 python3native pkgconfig
 
SRC_URI[md5sum] = "410d3968c7f45171285bcac76bbad265"
SRC_URI[sha256sum] = "d25e44eb44e43762b2fd0c5874e51954e0f1181fd9800d8a6756be6d084812d8"

#do_configure_prepend() {
#    sed '/^\w+Kivy-Garden>=0.1.4$/d' -i ${S}/setup.cfg
#}

do_compile_prepend() {
    export KIVY_SDL2_PATH="`pkg-config --cflags-only-I sdl2 | cut -c 3`"
}

do_install_prepend() {
    export KIVY_SPLIT_EXAMPLES=1
}


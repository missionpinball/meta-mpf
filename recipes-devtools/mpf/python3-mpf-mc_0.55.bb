SUMMARY = "Mission Pinball Framework (MPF) game engine for pinball machines"
HOMEPAGE = "https://github.com/missionpinball/mpf-mc/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0703cadeebbe97be7a6e70d00ad796b3"

BRANCH = "dev"
COMMIT = "907e812e7e199b0ab20c1c1b8f6b7e7fbd1e713f"

DEPENDS = "virtual/libsdl2 libsdl2-image libsdl2-mixer libsdl2-net libsdl2-ttf freetype python3-cython-native gstreamer1.0"
RDEPENDS_${PN} += "python3 python3-psutil-mpf python3-ruamel-yaml-mpf python3-kivy-mpf python3-ffpyplayer-mpf python3-pygments-mpf gstreamer1.0 libsdl2-mixer libsdl2-ttf freetype libsdl2-image"

inherit pypi setuptools3 python3native pkgconfig

SRC_URI = "git://github.com/missionpinball/mpf-mc.git;protocol=git;branch=${BRANCH};rev=${COMMIT}"
S = "${WORKDIR}/git"

BBCLASSEXTEND = "native nativesdk"

do_compile_prepend() {
    export KIVY_SDL2_PATH="`pkg-config --cflags-only-I sdl2 | cut -c 3`"
    export USE_CYTHON=1
}

do_install_prepend() {
    export KIVY_SDL2_PATH="`pkg-config --cflags-only-I sdl2 | cut -c 3`"
    export USE_CYTHON=1
}

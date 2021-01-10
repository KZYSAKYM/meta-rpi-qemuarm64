require recipes-core/images/core-image-base.bb
require recipes-graphics/images/core-image-weston.bb

SUMMARY = "The image of the platforn for qemuarm64 with kvm"

LICENSE = "MIT"

# compatible machines
MACHINEOVERRIDES =. "rpi-qemuarm64:"
MACHINEOVERRIDES =. "rpi-qemuarm64-host:"

# Features and packages
REQUIRED_DISTRO_FEATURES = "wayland opengl systemd"

DISTRO_FEATURES_append = " wayland opengl systemd x11"
MACHINE_FEATURES_append = " vc4graphics"

IMAGE_INSTALL_append = " qemu android-tools"

# rpi peripheral configuration
VIDEO_CAMERA = "1"
RASPBERRYPI_CAMERA_V2 = "1"
ENABLE_I2C = "1"

# Image fs types
IMAGE_FSTYPES = " tar.bz2 ext4"
SDIMG_ROOTFS_TYPE = "wic"

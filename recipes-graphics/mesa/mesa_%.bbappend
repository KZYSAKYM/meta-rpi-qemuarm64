PACKAGECONFIG_rpi-qemuarm64-host_append = " \
    wayland gbm dri dri3 opengl gles egl vc4 virgl gallium \
"

PACKAGECONFIG_rpi-qemuarm64-guest_append = " \
    wayland gbm dri dri3 opengl gles egl virgl gallium \
"

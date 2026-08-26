import pulumi
import pulumi_null as null

bgp_password = "955dB0b81Ef"
project_id = "<UUID_of_your_project>"
interface_lo0 = f"""auto lo:0
iface lo:0 inet static
   address {addr["address"]}
   netmask {addr["netmask"]}
"""
bird_conf = f"""filter equinix_metal_bgp {{
    if net = {addr["address"]}/{addr["cidr"]} then accept;
}}
router id {test["network"][2]["address"]};
protocol direct {{
    interface "lo";
}}
protocol kernel {{
    scan time 10;
    persist;
    import all;
    export all;
}}
protocol device {{
    scan time 10;
}}
protocol bgp {{
    export filter equinix_metal_bgp;
    local as 65000;
    neighbor {test["network"][2]["gateway"]} as 65530;
    password "{bgp_password}";
}}
"""
configure_bird = null.Resource("configure_bird", triggers={
    "bird_conf": bird_conf,
    "interface": interface_lo0,
})

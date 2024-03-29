----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:38:25
-- Design Name: 
-- Module Name: Lab8_obj1_tb - Behavioral
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity Lab8_obj1_tb is
--  Port ( );
end Lab8_obj1_tb;

architecture Behavioral of Lab8_obj1_tb is
component Lab8_obj1
port(a,b,c,d: in std_logic;
 f:out std_logic);
 end component;
 signal a,b,c,d:std_logic;
 signal f: std_logic;
begin
uut: Lab8_obj1 port map(a=> a, b=>b, c=>c, d=>d, f=>f);
stimulus: process
begin
a<='0';b<='0';c<='0';d<='0'; wait for 10ns;
a<='0';b<='0';c<='0';d<='1'; wait for 10ns;
a<='0';b<='0';c<='1';d<='0'; wait for 10ns;
a<='0';b<='0';c<='1';d<='1'; wait for 10ns;
a<='0';b<='1';c<='0';d<='0'; wait for 10ns;
a<='0';b<='1';c<='0';d<='1'; wait for 10ns;
a<='0';b<='1';c<='1';d<='0'; wait for 10ns;
a<='0';b<='1';c<='1';d<='1'; wait for 10ns;
a<='1';b<='0';c<='0';d<='0'; wait for 10ns;
a<='1';b<='0';c<='0';d<='1'; wait for 10ns;
a<='1';b<='0';c<='1';d<='0'; wait for 10ns;
a<='1';b<='0';c<='1';d<='1'; wait for 10ns;
a<='1';b<='1';c<='0';d<='0'; wait for 10ns;
a<='1';b<='1';c<='0';d<='1'; wait for 10ns;
a<='1';b<='1';c<='1';d<='0'; wait for 10ns;
a<='1';b<='1';c<='1';d<='1'; wait for 10ns;
end process;

end Behavioral;
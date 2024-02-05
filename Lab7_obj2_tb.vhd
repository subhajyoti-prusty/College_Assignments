----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:54:41
-- Design Name: 
-- Module Name: Lab7_obj2_tb - Behavioral
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

entity Lab7_obj2_tb is
--  Port ( );
end Lab7_obj2_tb;

architecture Behavioral of Lab7_obj2_tb is
component Lab7_obj2
port(b0,b1,b2,b3:in std_logic;
g0,g1,g2,g3:out std_logic);
end component;
signal b0,b1,b2,b3: std_logic;
signal g0,g1,g2,g3: std_logic;
begin
uut: Lab7_obj2 port map(b0=>b0,b1=>b1,b2=>b2,b3=>b3,g0=>g0,g1=>g1,g2=>g2,g3=>g3);
stimulus:process
begin
b0 <= '0';b1<='0';b2<='0';b3<='0';wait for 10ns;
b0 <= '0';b1<='0';b2<='0';b3<='1';wait for 10ns;
b0 <= '0';b1<='0';b2<='1';b3<='0';wait for 10ns;
b0 <= '0';b1<='0';b2<='1';b3<='1';wait for 10ns;
b0 <= '0';b1<='1';b2<='0';b3<='0';wait for 10ns;
b0 <= '0';b1<='1';b2<='0';b3<='1';wait for 10ns;
b0 <= '0';b1<='1';b2<='1';b3<='0';wait for 10ns;
b0 <= '0';b1<='1';b2<='1';b3<='1';wait for 10ns;
b0 <= '1';b1<='0';b2<='0';b3<='0';wait for 10ns;
b0 <= '1';b1<='0';b2<='0';b3<='1';wait for 10ns;
b0 <= '1';b1<='0';b2<='1';b3<='0';wait for 10ns;
b0 <= '1';b1<='0';b2<='1';b3<='1';wait for 10ns;
b0 <= '1';b1<='1';b2<='0';b3<='0';wait for 10ns;
b0 <= '1';b1<='1';b2<='0';b3<='1';wait for 10ns;
b0 <= '1';b1<='1';b2<='1';b3<='0';wait for 10ns;
b0 <= '1';b1<='1';b2<='1';b3<='1';wait for 10ns;
end process;
end Behavioral;
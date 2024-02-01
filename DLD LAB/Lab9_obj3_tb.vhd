----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01.02.2024 12:48:51
-- Design Name: 
-- Module Name: Lab9_obj3_tb - Behavioral
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

entity Lab9_obj3_tb is
--  Port ( );
end Lab9_obj3_tb;

architecture Behavioral of Lab9_obj3_tb is
component Lab9_obj3
port(a,b,c:in std_logic;
sum,carry: out std_logic);
end component;
signal a,b,c,sum,carry:std_logic;
begin
uut:Lab9_obj3 port map(a=>a,b=>b,c=>c,sum=>sum,carry=>carry);
stimulus:process

begin
a<='0';b<='0';c<='0';wait for 10ns;
a<='0';b<='0';c<='1';wait for 10ns;
a<='0';b<='1';c<='0';wait for 10ns;
a<='0';b<='1';c<='1';wait for 10ns;
a<='1';b<='0';c<='0';wait for 10ns;
a<='1';b<='0';c<='1';wait for 10ns;
a<='1';b<='1';c<='0';wait for 10ns;
a<='1';b<='1';c<='1';wait for 10ns;
end process;
end Behavioral;

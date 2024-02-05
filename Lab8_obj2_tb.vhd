----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:45:27
-- Design Name: 
-- Module Name: Lab8_obj2_tb - Behavioral
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

entity Lab8_obj2_tb is
--  Port ( );
end Lab8_obj2_tb;

architecture Behavioral of Lab8_obj2_tb is
component Lab8_obj2
port(a,b: in std_logic;
p,q,r,s: out std_logic);
end component;
signal a,b:std_logic;
signal p,q,r,s:std_logic;
begin
uut: Lab8_obj2 port map(a=>a,b=>b,p=>p,q=>q,r=>r,s=>s);
stimulus:process
begin
a<='0';b<='0';wait for 10ns;
a<='0';b<='1';wait for 10ns;
a<='1';b<='0';wait for 10ns;
a<='1';b<='1';wait for 10ns;
end process;
end Behavioral;
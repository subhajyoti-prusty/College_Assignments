----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:55:04
-- Design Name: 
-- Module Name: Lab7_obj1_tb - Behavioral
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

entity Lab7_obj1_tb is
--  Port ( );
end Lab7_obj1_tb;

architecture Behavioral of Lab7_obj1_tb is
component Lab7_obj1
port(a0,a1,b0,b1:in std_logic;
e,g,l:out std_logic);
end component;
signal a1,a0,b1,b0: std_logic;
signal e,g,l: std_logic;
begin
uut: Lab7_obj1 port map(a1=>a1,a0=>a0,b1=>b1,b0=>b0,e=>e,g=>g,l=>l);
stimulus:process
begin
a1 <= '0'; a0<='0'; b1 <= '0'; b0 <='0';wait for 10ns;
a1 <= '0'; a0<='0'; b1 <= '0'; b0 <='1';wait for 10ns;
a1 <= '0'; a0<='0'; b1 <= '1'; b0 <='0';wait for 10ns;
a1 <= '0'; a0<='0'; b1 <= '1'; b0 <='1';wait for 10ns;
a1 <= '0'; a0<='1'; b1 <= '0'; b0 <='0';wait for 10ns;
a1 <= '0'; a0<='1'; b1 <= '0'; b0 <='1';wait for 10ns;
a1 <= '0'; a0<='1'; b1 <= '1'; b0 <='0';wait for 10ns;
a1 <= '0'; a0<='1'; b1 <= '1'; b0 <='1';wait for 10ns;
a1 <= '1'; a0<='0'; b1 <= '0'; b0 <='0';wait for 10ns;
a1 <= '1'; a0<='0'; b1 <= '0'; b0 <='1';wait for 10ns;
a1 <= '1'; a0<='0'; b1 <= '1'; b0 <='0';wait for 10ns;
a1 <= '1'; a0<='0'; b1 <= '1'; b0 <='1';wait for 10ns;
a1 <= '1'; a0<='1'; b1 <= '0'; b0 <='0';wait for 10ns;
a1 <= '1'; a0<='1'; b1 <= '0'; b0 <='1';wait for 10ns;
a1 <= '1'; a0<='1'; b1 <= '1'; b0 <='0';wait for 10ns;
a1 <= '1'; a0<='1'; b1 <= '1'; b0 <='1';wait for 10ns;
end process;
end Behavioral;
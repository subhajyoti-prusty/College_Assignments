----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:39:50
-- Design Name: 
-- Module Name: Lab8_obj2 - Behavioral
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

entity Lab8_obj2 is
    Port ( a,b : in STD_LOGIC;
           p,q,r,s : out STD_LOGIC);
end Lab8_obj2;

architecture Behavioral of Lab8_obj2 is

begin
p <= a and b;
q <= a and (not b);
r <= '0';
s <= b;
end Behavioral;

----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 22.01.2024 21:17:27
-- Design Name: 
-- Module Name: Lab9_obj2 - Behavioral
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

entity Lab9_obj2 is
    Port ( d0,d1,d2,d3 : in STD_LOGIC;
           x,y,v : out STD_LOGIC);
end Lab9_obj2;

architecture Behavioral of Lab9_obj2 is
begin
x<=d1 or d3;
y<= d3 or (d1 and (not d2));
v<= d0 or d1 or d2 or d3;
end Behavioral;

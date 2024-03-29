----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:51:39
-- Design Name: 
-- Module Name: Lab7_obj1 - Behavioral
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

entity Lab7_obj1 is
    Port ( a1,a0,b1,b0 : in STD_LOGIC;
           e,g,l : out STD_LOGIC);
end Lab7_obj1;

architecture Behavioral of Lab7_obj1 is

begin
e<=(a1 xnor b1) and (a0 xnor b0);
g<=(a1 and (not b1)) or ((a1 xnor b1) and (a0 and (not b0)));
l<=((not a1) and b1) or ((a1 xnor b1) and ((not a0) and b0));
end Behavioral;

----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 05.02.2024 12:50:56
-- Design Name: 
-- Module Name: Lab7_obj3 - Behavioral
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

entity Lab7_obj3 is
    Port ( a,b,c,d : in STD_LOGIC;
           p,q,r,s : out STD_LOGIC);
end Lab7_obj3;

architecture Dataflow of Lab7_obj3 is

begin
p <= not(a or b or c);
q <= b xor c;
r <= c;
s <= not d;

end Dataflow;